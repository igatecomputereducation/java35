//appending a string
StringBuilder sb=new StringBuilder("igate solutions");
sb.append(" kavali");
System.out.println(sb);

//changing character, insert, replace
StringBuilder sb=new StringBuilder("igate solutions");
sb.setCharAt(sb.indexOf(" ")+1,'p');
System.out.println(sb);
sb.replace(sb.indexOf(" ")+1,sb.length(),"computer");
System.out.println(sb);
sb.insert(sb.indexOf(" ")+1,"super ");
System.out.println(sb);

//deleting
StringBuilder sb=new StringBuilder("igate super solutions");
sb.delete(sb.indexOf(" ")+1,sb.lastIndexOf(" "));
System.out.println(sb);

//reverse
StringBuilder sb=new StringBuilder("linarp");
sb.reverse();
System.out.println(sb);