/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.app.LinkedListImpl;

/**
 *
 * @author santiago.vega-r
 */
public class Node<E> {
    E data;
    Node<E> next;
    public Node (E data, Node<E> next){
        this.data=data;
        this.next=next;
    }
}
