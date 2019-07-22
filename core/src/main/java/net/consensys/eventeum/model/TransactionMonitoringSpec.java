package net.consensys.eventeum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.web3j.crypto.Hash;

@Entity
@Data
@NoArgsConstructor
public class TransactionMonitoringSpec {

    @Id
    private String id;

    private TransactionIdentifierType type;

    private String transactionIdentifier;

    private String nodeName;

    public TransactionMonitoringSpec(TransactionIdentifierType type,
                                     String transactionIdentifier,
                                     String nodeName) {
        this.type = type;
        this.transactionIdentifier = transactionIdentifier;
        this.nodeName = nodeName;

        this.id = Hash.sha3String(transactionIdentifier + type + nodeName).substring(2);
    }

}
