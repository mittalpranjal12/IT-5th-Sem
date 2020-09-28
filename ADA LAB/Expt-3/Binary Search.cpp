#include<iostream>
#include <stdio.h>
#include<conio.h>
#include<ctime>
using namespace std;

void takeInput(int a[],int n)
{
	for(int i = 0; i < n; i++)
	{
		cin>>a[i];	
	}
}

int binarySearch(int a[], int element,int start, int end)
{
	int mid = (start+end)/2;
	if(start>end)
	{
		return -1;
	}
	if(a[mid] < element)
	{
		return binarySearch(a,element,mid+1,end);
	}
	else if(a[mid] > element)
	{
		return binarySearch(a,element,start,mid-1);
	}
	else
	{
		return mid;
	}
}

int main()
{
	clock_t c_start = clock();
	int a[50];
	int n;
	int element;

	cout<<"Enter the number of elements: ";
	cin>>n;

	cout<<"Enter the numbers in the array: ";

	takeInput(a,n);
	
	cout<<"Enter the number to search: ";
	cin>>element;
	
	int ans = binarySearch(a,element,0,n-1);
	cout<<"The number is present at index "<<ans;

	clock_t c_end = clock();
	long double time_elapsed_ms = 1000.0 * (c_end-c_start) / CLOCKS_PER_SEC;
	cout << "\nCPU time used in Binary Search: " << time_elapsed_ms << " ms\n";
return 0;
}
