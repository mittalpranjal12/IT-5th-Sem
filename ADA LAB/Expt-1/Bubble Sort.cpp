#include<iostream>
#include<stdio.h>
#include<conio.h>
#include<ctime>
using namespace std;

int main()
{
  clock_t c_start = clock();
  int i, j, k, n, temp;
  
  cout<<"Enter Number of Elements: ";
  cin>>n;

  int arr[n];
  cout<<"Enter the elements of array: ";

  for(i = 0;i < n;i++)
  {
    cin>>arr[i];
  }

  for(i = 0;i < n;i++)
  {
    for(j = i;j < n;j++)
    {
      if (arr[i] > arr[j])
      {
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
  }
  cout<<"Sorted Array using Bubble Sort: ";

  for(i = 0;i < n;i++)
  {
    cout<<arr[i]<<" ";
  }

  clock_t c_end = clock();
  long double time_elapsed_ms = 1000.0 * (c_end-c_start) / CLOCKS_PER_SEC;
  cout << "\nCPU time used: " << time_elapsed_ms << " ms\n";
}
