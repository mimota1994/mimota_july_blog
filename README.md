# mimota_july_blog

2019-05-28
至今已经粗略的做了一个blog
有如下功能
1. blog的创建
2. 首页展示所有的blog
3. blog的删除
4. blog详细的展示

今天需要做的工作就是
1. 首页展示的blog中加入简介，现在只是利用title做简介
2. 如果这个可以做完的话，看看分页如何弄

ok，今天已经把简介搞定，很简单，用的正则表达式<.*?>非贪婪匹配，多少个字还有待考察，20个字似乎太少了点，如果可以三行左右就好了，最好加个判断，如果三行全部显示了，就没有...省略符号，如果不能完全显示，那么就加入这个省略符号
发现一个很重要的功能还没有做，把这个提到前面吧
1. 修改博客