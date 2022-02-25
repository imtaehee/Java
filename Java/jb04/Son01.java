package jb04.part07;

public class Son01 extends Father{
    
    public Son01(){
        
        System.out.println(this.name);
        System.out.println(bank);
        System.out.println(branch);
        //System.out.println(password);

        System.out.println("은행 비밀번호:"+this.getPassword(0));
    }
}

