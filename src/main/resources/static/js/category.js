function btnEdit(key){
    $(document).ready(function() {
        $.ajax({
            url: "/category/showCategory",
            type: "GET",
            data: {
                id: key
            },
            success: function(response) {
                $('#edit_id').val(response.id_category);
                $('#edit_name').val(response.name);
                $("#edit_description").val(response.description);
                $("#edit_parent").val(response.parent_id);
            }
        });
    });
    clickEditToggle();
}
function deleteCategory(key){
    $(document).ready(function() {
        $.ajax({
            url: "/category/deleteCategory",
            type: "POST",
            data: {id: key},
            success: function (response) {
                location.reload();
                alert("Object deleted successfully");
            }
        });
    });
}
function saveCategory(){
    $(document).ready(function() {
        var data = $("#saveForm").serialize();
        $.ajax({
            url: "/category/saveCategory",
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
function updateCategory(){
    $(document).ready(function() {
        var data = $("#updateForm").serialize();
        console.log(data);
        $.ajax({
            url: "/category/updateCategory",
            type: "Post",
            data: data,
            success: function (response) {
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
            url: '/category/search',
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