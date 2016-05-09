<%-- 
    Document   : learningJQuery
    Created on : May 8, 2016, 7:29:53 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
<!--        <a href="javascript:void(0)" id="refreshLink">Refresh</a>-->
<!--        <script>
            $(document).on("ready", function () {
//                setInterval(function ()
//                {
//                    loadContent();
//                },1000);

                loadContent();
                $("#refreshLink").on("click", function () {
                    loadContent();
                });


            });

            function loadContent() {
//                $("#output").load("serverpages/page1.jsp", function () {
//                    
//                });

//                    $("#output").load("api/studentapi",function()
//                    {
//                        
//                    });


                //manipulating raw data and displaying the way we want
//                $.getJSON("api/studentapi", null, function (data) {
//                    var content = "";
//                    $.each(data, function (i, o) {
//                        content += o.firstName + " " + o.lastName + " " + o.phoneNumber + " " + o.address + " " + o.status + "</br>";
//                    });
//                    $("#output").html(content);
//                });

//might need to search in normal table
$("#searchInput").keyup(function () {
                searchTable($(this).val());
            });
            function searchTable(inputVal) {
                var table = $("#mytable");
                table.find('tr').each(function (index, row) {
                    var allCells = $(row).find('td');
                    if (allCells.length & gt; 0){
                        var found = false;
                        
                        allCells.each(function (index, td)
                        {
                            var regExp = new RegExp(inputVal, 'i');
                            if (regExp.test($(td).text()))
                            {
                                found = true;
                                return false;
                            }
                        });
                        if (found == true)
                            $(row).show();
                        else
                            $(row).hide();
                    }
                });
            }

            }


//                $("#search").on("click",function (){
//                    $("#mytable").show();
//                    if($("#searchInput").val.length >0){
//                        $("#mytable").filter(function (index,row)){
//                            return $(row).html().toUpperCase().indexOf($("#filter").val().toUpperCase()) < 0;
//            }).hide();
//                        }
//                    }
//                });
        </script>-->
    </body>
</html>
