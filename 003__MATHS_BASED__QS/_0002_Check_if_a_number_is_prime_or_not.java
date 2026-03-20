//Check if a number is prime or not

// A number is prime if it has only 2 factors → 1 and itself
//A prime number is a number greater than 1 that is divisible only by 1 and itself.
// 1 is NOT prime
// Small primes → 2, 3, 5, 7, 11


// public class _0002_Check_if_a_number_is_prime_or_not {
// public static void main(String args[]){
//     int num=12;
//     int count=0;
//     for(int i=1;i<=num;i++){
//         if(num%i==0){
//             count++;
//         }
//     }
//     if(count==2){
//         System.out.println("prime");
//     }else{
//         System.out.println("not prime");
//     }
// }    
// }


//______________________________________________________________________________________________________________________




public class _0002_Check_if_a_number_is_prime_or_not {
public static void main(String args[]){
    int num=12;
    int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("prime");
    }else{
        System.out.println("not prime");
    }
}    
}
