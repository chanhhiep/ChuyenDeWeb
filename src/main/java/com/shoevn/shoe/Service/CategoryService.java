package com.shoevn.shoe.Service;



import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.admin.repository.CategoryRepository;
import com.shoevn.shoe.dtos.CategoryDto;
import com.shoevn.shoe.dtos.mappers.CategoryDtoMapper;
import com.shoevn.shoe.dtos.request.CategoryRequest;
import com.shoevn.shoe.dtos.request.UpdateCategoryRequest;
import com.shoevn.shoe.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    CategoryDtoMapper mapper;

    public CategoryDto createCategory (@Valid CategoryRequest request){
        Category category=Category.builder()
                .name(request.getName())
                .img(request.getImg())
                .parent_id(request.getParent())
                .build();
        Category save=categoryRepository.save(category);
        return mapper.apply(save);
    }
    public CategoryDto updateCategory (UpdateCategoryRequest request){
        Optional<Category> optionalCategory=categoryRepository.findById(request.getId());
        Category category=optionalCategory.get();
        category.setName(request.getName());
        Category save=categoryRepository.save(category);
        return mapper.apply(save);
    }
    public Response deleteCategory (Long idCategory){
        Optional<Category> optionalCategory=categoryRepository.findById(idCategory);
        Category category=optionalCategory.get();
        categoryRepository.delete(category);
        return new Response(200,null,null);
    }

    public List<CategoryDto> getAll(){
        List<Category> list=categoryRepository.findAll();
        List<CategoryDto> listResult=list.stream().map(mapper::apply).collect(Collectors.toList());
        return listResult;
    }

    public  CategoryDto findByCategoryId(long id){
        return mapper.apply(categoryRepository.findById(id).get());
    }
    public List<CategoryDto> findByParentId(int parentId){
        List<Category> list = categoryRepository.findByParentId(parentId);
        List<CategoryDto> categoryDtoList = list.stream().map(mapper::apply).collect(Collectors.toList());
        return categoryDtoList;
    }

}
