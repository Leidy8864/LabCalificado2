package pe.leidy_cs.labcalificado2.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.leidy_cs.labcalificado2.models.Company;

public class CompanyRepository {

    private static List<Company> companies;

    static {
        companies = new ArrayList<>();
        companies.add(new Company(100, "Restaurantes"   , "La casa del Tacu Tacu", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company8", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(101, "Restaurantes"   , "Comidisima", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company2", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(102, "Bares"          , "Sopranos", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company3", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(103, "Pollerias"      , "Don Belisario", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company4", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(104, "Restaurantes"   , "Ajo macho", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company5", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(105, "Restaurantes"   , "Raices del Peru", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company7", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(106, "Pastelerias"    , "Tortelin", "Metropolitana 733, Distrito de Lima 15011", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company6", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(107, "Restaurantes"   , "Taypa", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company8", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(108, "Tiendas"        , "Avinka", "Jr. Pellotihue 53-48", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company9", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(109, "Tiendas"        , "Sakimoto", " Nicolás Ayllón 4306, Ate 15012", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company10", "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(110, "Tiendas"        , "Efe", " Av. Nicolas Ayllon, Mz. L Lt. 25.", "(323) 555-44458", "informes@lacasadeltacutacu.com", "http://www.lacasadeltacutacu.com", "ic_company11", "dejece cautiva por el mejor sabor criollo"));
    }

    public static List<Company> getCompanies(){
        return companies;
    }
}
