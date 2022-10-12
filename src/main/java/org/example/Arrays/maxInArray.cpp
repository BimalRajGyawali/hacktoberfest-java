#include<iostream>
using namespace std;

//function to find max in given array
int main(){
    int arr[5] = {1,2,3,4,5};
    int max = arr[0];
    for(int i=0;i<5;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    cout<<max;
    return 0;
}
