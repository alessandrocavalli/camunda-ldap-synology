# camunda-ldap-synology

This example enables LDAP authentication for Camunda SpringBoot, using Synology integrated LDAP.
The bpmn file has no importance at all.

## Recipe:

- Camunda Spring Boot
- Synology NAS
- LDAP Server installed


### LDAP Server configuration:

- Make sure you configure a FQDN name in LDAP server settings (as server provider). For instance, in this example, it is ldap.server.
- Make sure you disable user creation in the configuration, or you will have some errors saying that LDAP is read only.
- If not exists, create a group named "administrators"
- If not exists, create a user named "admin"

The last two above instructions to comply the application.yaml file...

    security.administrator:
     administratorGroupName: administrators 
     administratorUserName: admin



### Laptop configuration:

Make sure you modify your hosts file to map your synology nas to ldap.server (ie: 192.168.1.34     ldap.server)

### yaml configuration:

Change security.ldap.managerPassword which needs to be the same than the one configured on your ldap server

### How to test LDAP connection:

    ldapsearch -x -H ldap://ldap.server:389 -D "uid=root,cn=users,dc=ldap,dc=server" -w '6a6stttwtseg' -b "dc=ldap,dc=server"

