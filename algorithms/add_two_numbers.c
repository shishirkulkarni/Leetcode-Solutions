#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct ListNode {
	int val;
	struct ListNode *next;
};

void print(struct ListNode *head)
{
	while(head) {
		printf("%d", head->val);
		head = head->next;
	}
}

struct ListNode *getNode(int data)
{
	struct ListNode *new = (struct ListNode *)malloc(sizeof(struct ListNode));
	new->next = NULL;
	new->val = data;
	return new;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
	int sum, carry = 0;
	struct ListNode *result = NULL, *tmp;
	
	while(l1 || l2) {
		sum = 0;
		sum += carry;
		carry = 0;
		if(l1) {
			sum += l1->val;
			l1 = l1 -> next;	
		}

		if(l2) {
			sum += l2->val;
			l2 = l2->next;
		}
		
		if(!result) {
			result = getNode(sum % 10);
			tmp = result;
		} else {
			tmp->next = getNode(sum % 10);
			tmp = tmp->next;
		}

		carry = sum / 10;
	}

	if(carry)
		tmp->next = getNode(carry);

	return result;
}

int main(void)
{
	struct ListNode *l1 = NULL, *l2 = NULL;
	int n1, n2;
	printf("Enter list sizes: ");
	scanf("%d%d", &n1, &n2);
	for(int i = 0; i < n1; i++){
		int data;
		scanf("%d", &data);
		if(!l1){
			l1 = getNode(data);
		} else {
			struct ListNode *tmp = l1;
			while(tmp->next)
				tmp = tmp->next;
			tmp->next = getNode(data);
		}
	}

	for(int i = 0; i < n2; i++){
		int data;
		scanf("%d", &data);
		if(!l2){
			l2 = getNode(data);
		} else {
			struct ListNode *tmp = l2;
			while(tmp->next)
				tmp = tmp->next;
			tmp->next = getNode(data);
		}
	}

	addTwoNumbers(l1, l2);
}