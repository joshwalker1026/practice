package linkedlist.single.queue;

import java.util.Stack;

public class queueByStack {

    Stack <String> input = new Stack <String>();
    Stack <String> output = new Stack <String>();

    public void push(String ip){
        input.add(ip);
    }

    public String pop(){
    if (!output.isEmpty()) return output.pop();
    else {
          while (!input.isEmpty()) {
            output.add(input.pop());
          }
          if (!output.isEmpty())
              return output.pop();
          else
              return null;
        }
    }

    public String peek(){
        if (!output.isEmpty()){
            return output.peek();
        }
        else {
            while (!input.isEmpty()){
                output.add(input.pop());
            }
        }
        return output.peek();
    }

    public static void main(String[] args){

        queueByStack sq = new queueByStack();

        sq.push("First");
        sq.push("Second");
        sq.push("Third");

        System.out.println(sq.peek());
        System.out.println(sq.pop());
        System.out.println(sq.peek());

        sq.push("Fourth");
        sq.push("Fifth");
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        sq.push("Seven");
        sq.push("Eight");
        System.out.println(sq.peek());
    }

}
