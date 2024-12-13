package com.example.bookInfo;

import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.web.bind.annotation.ControllerAdvice;

import graphql.GraphQLError;

@ControllerAdvice
public class BookControllerAdvice {
    @GraphQlExceptionHandler
    public GraphQLError exceptionHandle(Exception e) {
        return GraphQLError.newError()
                    .errorType(ErrorType.BAD_REQUEST)
                    .message(e.getMessage())
                    .build();
    }
}