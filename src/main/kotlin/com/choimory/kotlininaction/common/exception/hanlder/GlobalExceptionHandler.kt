package com.choimory.kotlininaction.common.exception.hanlder

import com.choimory.kotlininaction.common.data.response.CommonResponse
import com.choimory.kotlininaction.common.data.response.ResponseNotValidate
import com.choimory.kotlininaction.common.exception.CommonException
import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice("com.choimory")
@Slf4j
class GlobalExceptionHandler {
    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun exception(exception: Exception):CommonResponse<String>{
        exception.printStackTrace()
        return CommonResponse(
            status = HttpStatus.INTERNAL_SERVER_ERROR.value(),
            message = HttpStatus.INTERNAL_SERVER_ERROR.reasonPhrase,
            data = HttpStatus.INTERNAL_SERVER_ERROR.reasonPhrase,
        )
    }

    @ExceptionHandler(CommonException::class)
    fun commonException(exception: CommonException):ResponseEntity<CommonResponse<String>>{
        return ResponseEntity(
            CommonResponse(
                status = exception.status,
                message = exception.message),
            exception.httpStatus
        )
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun methodArgumentNotValidException(exception: MethodArgumentNotValidException):CommonResponse<List<ResponseNotValidate>>{
        return CommonResponse(
            status = HttpStatus.BAD_REQUEST.value(),
            message = HttpStatus.BAD_REQUEST.reasonPhrase,
            data = exception.fieldErrors.map {
                    fieldError:FieldError ->
                ResponseNotValidate(
                    fieldError.field,
                    fieldError.rejectedValue,
                    fieldError.defaultMessage
                )
            }
        )
    }

    @ExceptionHandler(ConstraintViolationException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun constraintViolationException(exception: ConstraintViolationException):CommonResponse<List<ResponseNotValidate>>{
        return CommonResponse(
            status = HttpStatus.BAD_REQUEST.value(),
            message = HttpStatus.BAD_REQUEST.reasonPhrase,
            data = exception.constraintViolations.map {
                    constraintViolation ->
                ResponseNotValidate(
                    constraintViolation.propertyPath.toString(),
                    constraintViolation.invalidValue,
                    constraintViolation.message)
            }
        )
    }
}