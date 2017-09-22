package com.example.domain;

public class EstadisticasPosicion {
    private String posicion;
    private Double numCanastas;
    private Double numAsistencias;
    private Double numRebotes;

    private Double minCanastas;
    private Double maxCanastas;
    private Double minAsistencias;
    private Double maxAsistencias;
    private Double minRebotes;
    private Double maxRebotes;

    public EstadisticasPosicion() {
    }

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numAsistencias, Double numRebotes) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numAsistencias = numAsistencias;
        this.numRebotes = numRebotes;
    }

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numAsistencias, Double numRebotes, Double minCanastas, Double maxCanastas, Double minAsistencias, Double maxAsistencias, Double minRebotes, Double maxRebotes) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numAsistencias = numAsistencias;
        this.numRebotes = numRebotes;
        this.minCanastas = minCanastas;
        this.maxCanastas = maxCanastas;
        this.minAsistencias = minAsistencias;
        this.maxAsistencias = maxAsistencias;
        this.minRebotes = minRebotes;
        this.maxRebotes = maxRebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(Double numCanastas) {
        this.numCanastas = numCanastas;
    }

    public Double getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(Double numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public Double getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(Double numRebotes) {
        this.numRebotes = numRebotes;
    }

    public Double getMinCanastas() {
        return minCanastas;
    }

    public void setMinCanastas(Double minCanastas) {
        this.minCanastas = minCanastas;
    }

    public Double getMaxCanastas() {
        return maxCanastas;
    }

    public void setMaxCanastas(Double maxCanastas) {
        this.maxCanastas = maxCanastas;
    }

    public Double getMinAsistencias() {
        return minAsistencias;
    }

    public void setMinAsistencias(Double minAsistencias) {
        this.minAsistencias = minAsistencias;
    }

    public Double getMaxAsistencias() {
        return maxAsistencias;
    }

    public void setMaxAsistencias(Double maxAsistencias) {
        this.maxAsistencias = maxAsistencias;
    }

    public Double getMinRebotes() {
        return minRebotes;
    }

    public void setMinRebotes(Double minRebotes) {
        this.minRebotes = minRebotes;
    }

    public Double getMaxRebotes() {
        return maxRebotes;
    }

    public void setMaxRebotes(Double maxRebotes) {
        this.maxRebotes = maxRebotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstadisticasPosicion that = (EstadisticasPosicion) o;

        if (posicion != null ? !posicion.equals(that.posicion) : that.posicion != null) return false;
        if (numCanastas != null ? !numCanastas.equals(that.numCanastas) : that.numCanastas != null) return false;
        if (numAsistencias != null ? !numAsistencias.equals(that.numAsistencias) : that.numAsistencias != null)
            return false;
        if (numRebotes != null ? !numRebotes.equals(that.numRebotes) : that.numRebotes != null) return false;
        if (minCanastas != null ? !minCanastas.equals(that.minCanastas) : that.minCanastas != null) return false;
        if (maxCanastas != null ? !maxCanastas.equals(that.maxCanastas) : that.maxCanastas != null) return false;
        if (minAsistencias != null ? !minAsistencias.equals(that.minAsistencias) : that.minAsistencias != null)
            return false;
        if (maxAsistencias != null ? !maxAsistencias.equals(that.maxAsistencias) : that.maxAsistencias != null)
            return false;
        if (minRebotes != null ? !minRebotes.equals(that.minRebotes) : that.minRebotes != null) return false;
        return maxRebotes != null ? maxRebotes.equals(that.maxRebotes) : that.maxRebotes == null;
    }

    @Override
    public int hashCode() {
        int result = posicion != null ? posicion.hashCode() : 0;
        result = 31 * result + (numCanastas != null ? numCanastas.hashCode() : 0);
        result = 31 * result + (numAsistencias != null ? numAsistencias.hashCode() : 0);
        result = 31 * result + (numRebotes != null ? numRebotes.hashCode() : 0);
        result = 31 * result + (minCanastas != null ? minCanastas.hashCode() : 0);
        result = 31 * result + (maxCanastas != null ? maxCanastas.hashCode() : 0);
        result = 31 * result + (minAsistencias != null ? minAsistencias.hashCode() : 0);
        result = 31 * result + (maxAsistencias != null ? maxAsistencias.hashCode() : 0);
        result = 31 * result + (minRebotes != null ? minRebotes.hashCode() : 0);
        result = 31 * result + (maxRebotes != null ? maxRebotes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EstadisticasPosicion{" +
                "posicion='" + posicion + '\'' +
                ", numCanastas=" + numCanastas +
                ", numAsistencias=" + numAsistencias +
                ", numRebotes=" + numRebotes +
                ", minCanastas=" + minCanastas +
                ", maxCanastas=" + maxCanastas +
                ", minAsistencias=" + minAsistencias +
                ", maxAsistencias=" + maxAsistencias +
                ", minRebotes=" + minRebotes +
                ", maxRebotes=" + maxRebotes +
                '}';
    }
}
