function clickEditToggle(){
    var popup = document.getElementById("product_edit");
    popup.classList.toggle('active');
    var blur = document.getElementById("blur-action");
    blur.classList.toggle('active');
}
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
                if (response.success) {
                    window.location.reload();
                    alert("Object deleted successfully");
                } else {
                    alert("Error deleting object");
                }
            }
        });
    });
}
function saveProduct(){
   /* var data = {
        id:$("#edit_id").val(),
        name: $("#edit_name").val(),
        category:$("#edit_category").val(),
        price:$("#edit_price").val(),
        discountRate:$("#edit_rate").val(),
        description:$("#edit_description").val(),
        quantity:$("#edit_quantity").val(),
        brand:$("#edit_brand").val(),
        size:[$("#edit_size").val()],
    };*/
    $(document).ready(function() {
        $.ajax({
            url: "/product/updateProduct",
            type: "Post",
            data: {
                id: $("#edit_id").val(),
                name: $("#edit_name").val(),
                category: $("#edit_category").val(),
                price: $("#edit_price").val(),
                discountRate: $("#edit_rate").val(),
                description: $("#edit_description").val(),
                quantity: $("#edit_quantity").val(),
                brand: $("#edit_brand").val(),
                size: [$("#edit_size").val()],
            },
            success: function (response) {
                if (response.status === 200) {

                    alert('Product updated successfully');
                } else {
                    alert('Error updating Product');
                }
            }
        });
    });
}
function updateProduct(){
    $(document).ready(function() {
        /*
        var data = {
            id:$("#edit_id").val(),
            name: $("#edit_name").val(),
            category:$("#edit_category").val(),
            price:$("#edit_price").val(),
            discountRate:$("#edit_rate").val(),
            description:$("#edit_description").val(),
            quantity:$("#edit_quantity").val(),
            brand:$("#edit_brand").val(),
            size:[$("#edit_size").val()],
        };*/
        var data = $("#updateForm").serialize();
        console.log(data);
        $.ajax({
            url: "/product/updateProduct",
            type: "Post",
            data: data,
            success: function (response) {
                if (response.status === 200) {
                    window.location.reload();
                    alert('Product updated successfully');
                } else {
                    alert('Error updating Product' + response.status);
                }
            }
        });
    });
}
function search(){
    $(document).ready(function() {
            console.log("keyup")
            console.log($("#searchTerm").val())
            $.ajax({
                url: '/product/search',
                type: 'POST',
                data: {
                    keyword: $("#searchTerm").val()
                },
                success: function(response) {
                    // Do something with the results of the search
                    $('#data_table').load(document.URL+ ' #data_table');
                    console.log(response);
                }
            });
        });
}
function clickCreateToggle(){
    var popup = document.getElementById("create-product");
        popup.classList.toggle('active');
    var blur = document.getElementById("blur-action");
        blur.classList.toggle('active');
}
