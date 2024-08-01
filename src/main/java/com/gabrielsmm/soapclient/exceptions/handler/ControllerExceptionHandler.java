package com.gabrielsmm.soapclient.exceptions.handler;

import com.gabrielsmm.soapclient.exceptions.ConexaoException;
import com.gabrielsmm.soapclient.exceptions.ValidacaoException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ConexaoException.class)
    public ResponseEntity<ErroPadrao> conexao(ConexaoException e, HttpServletRequest request) {
        ErroPadrao erro = new ErroPadrao(System.currentTimeMillis(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "Erro de conexão.", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(erro);
    }

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity<ErroPadrao> validacao(ValidacaoException e, HttpServletRequest request) {
        ErroPadrao erro = new ErroPadrao(System.currentTimeMillis(), HttpStatus.UNPROCESSABLE_ENTITY.value(), "Erro de validação.", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(erro);
    }

}
