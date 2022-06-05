package com.masaiEvalQ2;


/*
 Deadlock: It is a condition when nothing happens and one thread is waiting for each other.
 If thread 1 is waiting for Thread 2 and Thread 2 is waiting for Thread 1 then it is 
 Deadlock condition. ie: when two threads are waiting for each other forever.
 we dont have any solution for deadlock condition we can only do some prevention.
 
 The synchronized keyword is the reason for deadlock. so we can prevent deadlock from happening
 if we remove the synchronized keyword from any method of any class.


 */



/*
 Two synchronized thread communicate with each other by using methods like: wait() and notify().
 
 if we want to suspend a synchronized thread unconditionally then we use wait() method.
 if we want to resume a suspended(waiting) thread then we use notify() method.
 
 
 To call wait() or notify() method on any object we must have that object locked else we will
 get a exception.
 Once a thread calls wait() method on any object, first it releases the lock of that object and
 then it enters into the waiting state immediately.
 Once a thread calls notify() method on any object it also releases the lock of that object but not immediately.

 
 
 */




