package demo.hello;

public class test {

    public static void main(String[] args) {
        /*Object[] object=new Object[4];
        object[0]=1;
        Object[] object1=new Object[]{1,2.3,4,5};

        Person[] peoples=new Person[3];
        peoples[0]=new Person();

        List<Person> list=new ArrayList<Person>();
        list.add(new Person());*/

        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        int[] addArr=new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
//            addArr[i]=arr[i];
        }
//        addArr[arr.length]=4;
        //在数组末尾加一个元素
        for (int i=0;i<addArr.length;i++){
            if(arr.length==i){
                addArr[i]=4;
            }else{
                addArr[i]=arr[i];
            }
        }
        for (int a:addArr) {
            System.out.println(a);
        }

        //根据下标删除元素
        int[] deleteArr=new int[addArr.length-1];
        for (int i=0;i<addArr.length;i++){
            if(i<2){
                deleteArr[i]=addArr[i];
            }else if(i>2){
                deleteArr[i-1]=addArr[i];
            }
        }
        for (int a:deleteArr) {
            System.out.println(a);
        }

        Object[] object1=new Object[]{1,2.3,4,5};
        for (Object object:object1) {
            System.out.println(object);
        }
    }
}
