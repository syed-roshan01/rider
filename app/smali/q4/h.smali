.class public final Lq4/h;
.super Lq/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILq4/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq4/h;->a:I

    iput-object p2, p0, Lq4/h;->b:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1}, Lq/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lk6/t4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq4/h;->a:I

    iput-object p1, p0, Lq4/h;->b:Ljava/lang/Object;

    const/16 p1, 0x14

    .line 1
    invoke-direct {p0, p1}, Lq/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lq4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lq/n;->create(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lf6/a;->u(Ljava/lang/String;)V

    iget-object v0, p0, Lq4/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/t4;

    invoke-virtual {v0}, Lk6/m7;->p()V

    invoke-static {p1}, Lf6/a;->u(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lk6/t4;->h:Lq/f;

    invoke-virtual {v1, p1}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zza()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, p1}, Lq/f;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p1}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p1}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-virtual {v0, p1, v1}, Lk6/t4;->x(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfc$zzd;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1}, Lk6/t4;->H(Ljava/lang/String;)V

    :goto_0
    iget-object v0, v0, Lk6/t4;->j:Lq4/h;

    invoke-virtual {v0}, Lq/n;->snapshot()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzb;

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lq4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Lq/n;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p2, Lq4/c;

    check-cast p3, Lq4/g;

    check-cast p4, Lq4/g;

    iget-object p1, p0, Lq4/h;->b:Ljava/lang/Object;

    check-cast p1, Lq4/i;

    iget-object p1, p1, Lq4/i;->a:Lq4/m;

    iget-object p4, p3, Lq4/g;->a:Landroid/graphics/Bitmap;

    iget-object v0, p3, Lq4/g;->b:Ljava/util/Map;

    iget p3, p3, Lq4/g;->c:I

    invoke-interface {p1, p2, p4, v0, p3}, Lq4/m;->c(Lq4/c;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, Lq4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lq/n;->sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Lq4/c;

    check-cast p2, Lq4/g;

    iget p1, p2, Lq4/g;->c:I

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
