public class Nomera {
    public static void main(String[] args){

        //В американской армии считается несчастливым число 13, а в японской — 4.
        // Перед международными учениями штаб российской армии решил исключить номера
        // боевой техники, содержащие числа 4 или 13 (например, 40123, 13313,
        // 12345 или 13040), чтобы не смущать иностранных коллег. Если в распоряжении
        // армии имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет
        // номер от 00001 до 99999, то сколько всего номеров придётся исключить?

        int count = 0;

        for (int i=1; i<=99999; i++){
            int num = i;
            boolean Four = false;
            while (num >0){
                int figure = num%10;
                if (figure == 4){
                    Four = true;
                    break;
                }
                num /= 10;
            }

            num = i;
            boolean Thrirty =false;
            while (num>0){
                int digit = num%100;
                if (digit == 13){
                    Thrirty = true;
                    break;
                }
                num /= 10;
            }

            if (Four || Thrirty){
                count ++;
            }
        }
        System.out.println("Количество исключенных номеров: " + count);
    }
}
