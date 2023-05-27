function btnEdit(key){
    $(document).ready(function() {
        $.ajax({
            url: "/payment/showPayment",
            type: "GET",
            data: {
                id: key
            },
            success: function(response) {
                $('#edit_id').val(response.id);
                $('#edit_name').val(response.name);
                $('#edit_description').val(response.description);
            }
        });
    });
    clickEditToggle();
}
function deletePayment(key){
    $(document).ready(function() {
        $.ajax({
            url: "/payment/deletePayment",
            type: "POST",
            data: {id: key},
            success: function (response) {
                location.reload();
                alert("Object deleted successfully");
            }
        });
    });
}
function savePayment(){
    $(document).ready(function() {
        var data = $("#saveForm").serialize();
        $.ajax({
            url: "/payment/savePayment",
            type: "Post",
            data: data,
            success: function (response) {
                console.log("get save infomation")
                //$('#data_table').load("http://localhost:8080/product"+ ' #data_table');
                alert('Product updated successfully');
            }
        });
    });
}
function updatePayment(){
    $(document).ready(function() {
        var data = $("#updateForm").serialize();
        console.log(data);
        $.ajax({
            url: "/payment/updatePayment",
            type: "Post",
            data: data,
            success: function (response) {
                location.reload();
                alert(' updated successfully');
            }
        });
    });
}
function search(){
    $(document).ready(function() {
        console.log("keyup")
        var key = $("#searchTerm").val();
        $.ajax({
            url: '/payment/search',
            type: 'POST',
            data: {
                keyword: $("#searchTerm").val()
            },
            success: function(response) {
                // Do something with the results of the search
                //$("#search_result").text(response);
                //$('#data_table').load(document.URL+ ' #data_table');
                //location.reload();
                $("#searchTerm").text(key);
                console.log(response);
            }
        });
    });
}