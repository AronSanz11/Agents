package ontologies;

import jade.content.*;


public class Problem implements Concept{
// -------------------------------------

   private int num;
   private String msg;

   public int getNum() {
      return this.num;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setNum(int num) {
      this.num = num;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }
}
