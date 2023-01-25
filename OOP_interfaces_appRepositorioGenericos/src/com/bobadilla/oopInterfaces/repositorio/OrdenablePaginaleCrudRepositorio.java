package com.bobadilla.oopInterfaces.repositorio;

public interface OrdenablePaginaleCrudRepositorio<T> extends OrdenableRepositorio<T>,
                PaginableRepositorio<T>, CruidRepositorio<T>,ContableRepositorio{
}
