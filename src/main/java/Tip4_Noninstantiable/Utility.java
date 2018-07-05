package Tip4_Noninstantiable;
//1.通过私有构造器强化不可实例化的能力
public class Utility {
    private Utility(){
        //Suppress default constructor for noninstantiability
        throw new AssertionError();
    }

}
