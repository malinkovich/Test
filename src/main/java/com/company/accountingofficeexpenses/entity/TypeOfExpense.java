package com.company.accountingofficeexpenses.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "TYPE_OF_EXPENSE")
@Entity
public class TypeOfExpense {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    @InstanceName
    @Column(name = "TITLE_TYPE_EXPENSE", nullable = false)
    @NotNull
    private String titleTypeExpense;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "typeOfExpense")
    private List<Expense> expenseType;

    @Column(name = "DESCRIPTION_TYPE_EXPENSE")
    private String descriptionTypeExpense;

    @Column(name = "LIMIT_SUM_EMPLOYEE", nullable = false, precision = 19, scale = 2)
    @NotNull
    private BigDecimal limitSumEmployee;

    public List<Expense> getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(List<Expense> expenseType) {
        this.expenseType = expenseType;
    }

    public BigDecimal getLimitSumEmployee() {
        return limitSumEmployee;
    }

    public void setLimitSumEmployee(BigDecimal limitSumEmployee) {
        this.limitSumEmployee = limitSumEmployee;
    }

    public String getDescriptionTypeExpense() {
        return descriptionTypeExpense;
    }

    public void setDescriptionTypeExpense(String descriptionTypeExpense) {
        this.descriptionTypeExpense = descriptionTypeExpense;
    }

    public String getTitleTypeExpense() {
        return titleTypeExpense;
    }

    public void setTitleTypeExpense(String titleTypeExpense) {
        this.titleTypeExpense = titleTypeExpense;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}