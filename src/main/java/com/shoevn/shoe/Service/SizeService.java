package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Size;

import com.shoevn.shoe.admin.repository.ProductRepository;
import com.shoevn.shoe.admin.repository.SizeRepository;
import com.shoevn.shoe.dtos.SizeDto;
import com.shoevn.shoe.dtos.auth.SizeDTO;
import com.shoevn.shoe.dtos.mappers.SizeDtoMapper;
import com.shoevn.shoe.dtos.request.SizeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SizeService {
    @Autowired
    private SizeRepository sizeRepository;
    @Autowired
    private SizeDtoMapper mapper;
    @Autowired
    private ProductRepository productRepository;

    public List<SizeDto> getAll(){
        List<Size> list = sizeRepository.findAll();
        List<SizeDto> sizeDtoList = list.stream().map(mapper::apply).collect(Collectors.toList());
        return sizeDtoList;
    }

    public List<SizeDto> getInfoProduct(long id){
        List<Size> list = sizeRepository.getAllSizeById(id);
        List<SizeDto> sizeDtos = list.stream().map(mapper::apply).collect(Collectors.toList());
        return sizeDtos;
    }
    public Size createSize(SizeDTO sizeDTO){
        Size size = new Size();
        Product product = productRepository.findById(sizeDTO.getProduct()).get();

        size.setSize_num(sizeDTO.getNSize());
        size.setProduct(product);

        return sizeRepository.save(size);
    }
    public  SizeDto create(@Valid SizeRequest request){
        Product product = productRepository.findById(request.getIdPro()).get();

        Size size = Size.builder()
                .size_num(request.getNSize())
                .build();
        Size save = sizeRepository.save(size);
        return mapper.apply(save);
    }
}
