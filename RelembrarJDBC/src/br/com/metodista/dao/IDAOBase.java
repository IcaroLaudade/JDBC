/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.metodista.dao;


import java.util.List;

/**
 *
 * @author Icaro
 * @param <T>
 */
public interface IDAOBase<T> {

    public void save(T bo);

    public void update(T bo);

    public void delete(T bo);

    public T find(int codigo);

    public List<T> list();

}
