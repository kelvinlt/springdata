package com.example.domain;

public class EstadisticasPosicion {
    private String posicion;
    private Double numCanastas;
    private Double numAsistencias;
    private Double numRebotes;

    public EstadisticasPosicion() {
    }

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numAsistencias, Double numRebotes) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numAsistencias = numAsistencias;
        this.numRebotes = numRebotes;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstadisticasPosicion that = (EstadisticasPosicion) o;

        if (posicion != null ? !posicion.equals(that.posicion) : that.posicion != null) return false;
        if (numCanastas != null ? !numCanastas.equals(that.numCanastas) : that.numCanastas != null) return false;
        if (numAsistencias != null ? !numAsistencias.equals(that.numAsistencias) : that.numAsistencias != null)
            return false;
        return numRebotes != null ? numRebotes.equals(that.numRebotes) : that.numRebotes == null;
    }

    @Override
    public int hashCode() {
        int result = posicion != null ? posicion.hashCode() : 0;
        result = 31 * result + (numCanastas != null ? numCanastas.hashCode() : 0);
        result = 31 * result + (numAsistencias != null ? numAsistencias.hashCode() : 0);
        result = 31 * result + (numRebotes != null ? numRebotes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EstadisticasPosicion{" +
                "posicion='" + posicion + '\'' +
                ", numCanastas=" + numCanastas +
                ", numAsistencias=" + numAsistencias +
                ", numRebotes=" + numRebotes +
                '}';
    }
}
