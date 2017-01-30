#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node* next;
};

int main()
{
	
	struct node *start=NULL,*p,*temp,*q,*end;
	int num,n;
	char ch;
	
	while(1)
	{
		p=(struct node*)malloc(sizeof(struct node));
		printf("enter the data and press enter for next input:\n");
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
		end=p;
		printf("do you want to enter again(y/n)\n");
		scanf("%c",&ch);

		if(getchar()=='y')
		continue;
		else
		break;
	}
	
	printf("Status of list:\n");
	for(p=start;p!=NULL;p=p->next)
		printf("%d\n",p->data);
	
	
	printf("how many times you want to rotate:\n");
	scanf("%d",&num);
	printf("if u wanna rotate clockwise,enter 'c':and if want to rotate anticlockwise enter 'a'\n");
	scanf("%c",&ch);
	
	if(getchar()=='c')
	{
		p=start;
		while(p->next->next!=NULL)
		p=p->next;
		q=p;
	
		while(num--)
		{
		
			end->next=start;
			q->next=NULL;
			start=end;
			end=q;
			temp=start;
			
			while(temp->next!=q)
				temp=temp->next;		
			q=temp;
		}
		
	}
	else    
	{
		while(num--)
		{
			end->next=start;
			q=start->next;
			start->next=NULL;
			end=start;
			start=q;
		}
	}
	
	printf("final list status:\n");
	for(p=start;p!=NULL;p=p->next)
	{
		printf("%d\n",p->data);
	}	
	return 0;
	
}
