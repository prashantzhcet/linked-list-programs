#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next,*left;
	
};
struct node *start=NULL;
void rev(struct node *,int );
int main()
{
	int i,j,k,num,n;
	struct node *p,*temp;
	printf("number of nodes you want to enter:\n");
	scanf("%d",&num);
	printf("enter the elements:\n");
	k=num;
	while(num--)
	{
		p=(struct node*)malloc(sizeof(struct node));
		scanf("%d",&p->data);
	p->next=NULL;
		if(start==NULL)
		{
			start=p;
		}
		else
		{
			temp=start;
			while(temp->next!=NULL)
			{
				temp=temp->next;
			}
			temp->next=p;
		}
	}

	p=start;
	printf("\nAfter reversing the list:\n");
	rev(p,num);
	
	return 0;
}

void rev(struct node *flag,int n)
{

	if(flag==NULL)
	{
		return ;
	}
	
	if(flag->next!=NULL||n>0)
		rev(flag->next,n--);
	printf("%d\t",flag->data);
	
}

