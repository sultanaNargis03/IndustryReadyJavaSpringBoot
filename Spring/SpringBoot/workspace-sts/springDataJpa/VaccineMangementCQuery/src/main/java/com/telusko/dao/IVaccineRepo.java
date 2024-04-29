package com.telusko.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.telusko.bo.VaccineDetails;

import jakarta.transaction.Transactional;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	
//	@Query("FROM VaccineDetails WHERE vaccineCompany=:company")
//	public List<VaccineDetails> searchVaccineByCompanyName(String company);
	
	@Query("FROM VaccineDetails WHERE vaccineCompany=:company")
	public List<VaccineDetails> searchVaccineByCompanyName(@Param("company")String vc);
	
	@Query("FROM VaccineDetails WHERE vaccineCompany IN(:comp1, :comp2)")
	public List<VaccineDetails> searchVaccineByCompanies(String comp1,String comp2);

	@Query("SELECT vaccineName,vaccineCompany FROM VaccineDetails WHERE price BETWEEN :min AND :max")
	public List<String> searchVaccineByPriceRange(Integer min,Integer max);

	@Query("SELECT vaccineCompany,price FROM VaccineDetails WHERE vaccineName IN(:vac1, :vac2)")
	public List<Object[]> searchVaccineDetailsByVaccineName(String vac1,String vac2);

	@Transactional
	@Modifying
	@Query("UPDATE VaccineDetails SET price=:newPrice WHERE vaccineName=:vaccineName")
	public int updatePriceByVaccine(Integer newPrice,String vaccineName);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM VaccineDetails WHERE price BETWEEN :min AND :max")
	public int deleteVaccineByPriceRange(Integer min,Integer max);
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO vaccine_info(`vaccinename`,`vaccinecompany`,`price`) Values(?,?,?)",nativeQuery=true)
	public int insertVaccineDetails(String vaccineName,String vaccineCompany,Integer price);
	
	@Query(value="SELECT NOW() FROM DUAL",nativeQuery=true)
	public Date getTheSystemDateAndTime();

}
