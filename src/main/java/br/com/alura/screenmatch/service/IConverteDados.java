package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDados {
    <T> T obterDados (String jason, Class<T> classe) throws JsonProcessingException;
}
