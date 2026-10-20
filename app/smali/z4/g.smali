.class public final Lz4/g;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ride_history"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "getSharedPreferences(...)"

    invoke-static {p1, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz4/g;->a:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 15

    const-string v0, "optString(...)"

    const/4 v1, 0x0

    iget-object v2, p0, Lz4/g;->a:Landroid/content/SharedPreferences;

    const-string v3, "history_json"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lr8/r;->a:Lr8/r;

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v4, 0x0

    invoke-static {v4, v1}, Lz6/a;->s0(II)Li9/g;

    move-result-object v1

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v1}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Li9/e;->e()Li9/f;

    move-result-object v1

    :goto_0
    iget-boolean v6, v1, Li9/f;->c:Z

    if-eqz v6, :cond_1

    invoke-virtual {v1}, Li9/f;->b()I

    move-result v6

    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    new-instance v14, Lz4/f;

    const-string v7, "app"

    const-string v8, "Unknown"

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "fare"

    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    const-string v7, "accepted"

    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v10

    const-string v7, "ts"

    const-wide/16 v11, 0x0

    invoke-virtual {v6, v7, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v11

    const-string v7, "loc"

    const-string v13, ""

    invoke-virtual {v6, v7, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v14

    invoke-direct/range {v7 .. v13}, Lz4/f;-><init>(Ljava/lang/String;IZJLjava/lang/String;)V

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    move-object v2, v5

    :catch_0
    return-object v2
.end method
