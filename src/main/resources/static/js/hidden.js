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
                    console.log(response);
                    alert(response.id);
                }
            });
    });
    clickEditToggle();
}
function deleteProduct(key){
    $.ajax({
        url: "/product/deleteProduct",
        type: "POST",
        data: { id: key},
        success: function(response) {
            if (response.success) {
                alert("Object deleted successfully");
            } else {
                alert("Error deleting object");
            }
        }
    });
}
function saveProduct(){
    var data = {
        name: $("#name").val()
    };
}
function clickCreateToggle(){
    var popup = document.getElementById("create-product");
        popup.classList.toggle('active');
    var blur = document.getElementById("blur-action");
        blur.classList.toggle('active');
}
