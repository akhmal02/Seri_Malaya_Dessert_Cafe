/**
 *NAME : MUHAMMAD AKHMAL(2022870756), NIK YUSUF(2022606254), MUHAMMAD SYAFIQ(2022831866), 
 *       RIZALIFF NABIL (2022451146)
 *PROJECT : SERI MALAYA DESSERT CAFE
 *FILE : QUEUE
 *DATE START : 25/12/2023    DATE END :  /01/2024            
 */

import java.util.*;
public class Queue extends LinkedList 
{
    public Queue() {}
    
    public void enqueue(Object element) {
        addBack(element);
    }
    
    public Object dequeue() {
        return removeFirst();
    }
    
    public Object getFront() {
        return getHead();
    }
}