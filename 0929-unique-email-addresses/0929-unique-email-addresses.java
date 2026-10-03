class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> a = new HashSet<>();
        for(String s : emails){
            String[] p = s.split("@");
            String local = p[0];
            String domain = p[1];

            int plus = local.indexOf('+');
            if(plus != -1){
                local = local.substring(0,plus);

            }

            local = local.replace(".","");
            String finalemail = local+ "@"+ domain;
            a.add(finalemail);
        }
        return a.size();
    }
}