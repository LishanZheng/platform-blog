package edu.hfut.across.backend.dao;

import edu.hfut.across.backend.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PageMapper {

    List<Type> getSortPage();
}