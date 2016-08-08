 while(n!=0)
        {
            n1=n%10;
            n=n/10;
            s+=n1;
        }int s1=s;
        while(s!=0)
        {
            n1=s%10;
            rev=rev*10+n1;
            s=s/10;
        }if(s1==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
