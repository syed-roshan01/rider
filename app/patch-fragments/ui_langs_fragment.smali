
# ---- block 5: language table bridge (read-only accessor) ----
# Flattens g5/b.a (List<g5/a>) into [code, name, nativeName] * n for the
# Settings language picker. g5/a fields: a=ISO code, b=English name,
# c=language name in its own script (see analysis/settings_strings.json).
.method public static uiLangs()[Ljava/lang/String;
    .locals 8

    sget-object v0, Lg5/b;->a:Ljava/util/List;

    if-eqz v0, :empty

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :empty

    mul-int/lit8 v2, v1, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    :loop
    if-ge v3, v1, :done

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg5/a;

    mul-int/lit8 v5, v3, 0x3

    iget-object v6, v4, Lg5/a;->a:Ljava/lang/String;

    aput-object v6, v2, v5

    add-int/lit8 v7, v5, 0x1

    iget-object v6, v4, Lg5/a;->b:Ljava/lang/String;

    aput-object v6, v2, v7

    add-int/lit8 v5, v5, 0x2

    iget-object v6, v4, Lg5/a;->c:Ljava/lang/String;

    aput-object v6, v2, v5

    add-int/lit8 v3, v3, 0x1

    goto :loop

    :done
    return-object v2

    :empty
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method
