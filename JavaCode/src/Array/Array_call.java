package Array;
public class Array_call {
    String Name;
    int Age;

    Array_call(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return Name + " " + Age;
    }
}

class Test_Arr{
    public static void main(String[] args) {
        Array_call stArr[] = new Array_call[5];
        stArr[0] = new Array_call("First",10);
        stArr[1] = new Array_call("Second",11);
        stArr[2] = new Array_call("Third",12);
        stArr[3] = new Array_call("Fourth",13);
        stArr[4] = new Array_call("Fifth",14);
        for(int i=0; i< stArr.length; i++){
            System.out.println(stArr[i]);
        }

    }
}

