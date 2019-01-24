package com.company.project.service.impl;

import com.company.project.dao.FileMapper;
import com.company.project.model.File;
import com.company.project.service.FileService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/24.
 */
@Service
@Transactional
public class FileServiceImpl extends AbstractService<File> implements FileService {
    @Resource
    private FileMapper fileMapper;

}
