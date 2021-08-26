/**
 * 
 */
 function usersetting(usertype)
    {
        if(usertype== "student") {
                 $(".form-group a").each(function() {
                     if($(this).text()=="User Account"){
                         $(this).parent().hide();
                         }
                     else {  
                         $(this).parent().show();
                     }
                 });
        }
        else if(usertype== "admin") {
      $(".form-group a").each(function() {
                     if($(this).text()=="Lecture and Quiz") {
                         $(this).parent().hide();
                     }
                     else {  
                         $(this).parent().show();
                     }
                 });
        }
    }