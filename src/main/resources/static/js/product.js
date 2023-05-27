function btnEdit(key){
    $(document).ready(function() {
        $.ajax({
            url: "/product/showProduct",
            type: "GET",
            data: {
                id: key
            },
            success: function(response) {
                $('#edit_id').val(response.id);
                $('#edit_name').val(response.name);
                //$("#edit_category").val(response.category.name);
                $("#edit_price").val(response.price);
                $("#edit_rate").val(response.discountRate);
                $("#edit_description").val(response.description);
                $("#edit_quantity").val(response.quantity);
                //$("#edit_brand").val();
                //$("#edit_size").val();
                console.log(response);
                //alert(response.id);
            }
        });
    });
    clickEditToggle();
}
function deleteProduct(key){
    $(document).ready(function() {
        $.ajax({
            url: "/product/deleteProduct",
            type: "POST",
            data: {id: key},
            success: function (response) {
                //$('#data_table').load(document.URL+ '#data_table');
                location.reload();
                alert("Object deleted successfully");
            }
        });
    });
}
function saveProduct(){
    $(document).ready(function() {
        var data = $("#saveForm").serialize();
        $.ajax({
            url: "/product/saveProduct",
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
function updateProduct(){
    $(document).ready(function() {
        var data = $("#updateForm").serialize();
        console.log(data);
        $.ajax({
            url: "/product/updateProduct",
            type: "Post",
            data: data,
            success: function (response) {
                //$('#data_table').load(document.URL+ ' #data_table');
                location.reload();
                alert('Product updated successfully');
            }
        });
    });
}
function search(){
    $(document).ready(function() {
        console.log("keyup")
        var key = $("#searchTerm").val();
        $.ajax({
            url: '/product/search',
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