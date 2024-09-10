class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> b=new ArrayList<>();
        int open_parenthesis=0,close_parenthesis=0,index=0;
        char[] s=new char[2*n];
         generate(n,open_parenthesis,close_parenthesis,b,s,index);
         return b;
    }
    public void generate(int n,int open_parenthesis,int close_parenthesis,List<String>b,char[] s,int index)
    {
        if(index==2*n)
        {
           b.add(new String(s));
           return;
        }
        if(open_parenthesis<n)
        {
           s[index]='(';
           generate(n,open_parenthesis+1,close_parenthesis,b,s,index+1); 
        }
         if(open_parenthesis>close_parenthesis)
        {
           s[index]=')';
           generate(n,open_parenthesis,close_parenthesis+1,b,s,index+1); 
        }
    }
}
