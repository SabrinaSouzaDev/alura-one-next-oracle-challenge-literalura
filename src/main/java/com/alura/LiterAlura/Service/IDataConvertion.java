package com.alura.LiterAlura.Service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
