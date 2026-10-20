.class public final Ll/b0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lj/a;ILk6/d4;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ll/b0;->a:I

    iput-object p1, p0, Ll/b0;->c:Ljava/lang/Object;

    iput p2, p0, Ll/b0;->b:I

    iput-object p3, p0, Ll/b0;->d:Ljava/lang/Object;

    iput-object p4, p0, Ll/b0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/g0;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ll/b0;->a:I

    iput-object p1, p0, Ll/b0;->e:Ljava/lang/Object;

    iput-object p2, p0, Ll/b0;->c:Ljava/lang/Object;

    iput-object p3, p0, Ll/b0;->d:Ljava/lang/Object;

    iput p4, p0, Ll/b0;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Ll/b0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/b0;->c:Ljava/lang/Object;

    check-cast v0, Lj/a;

    iget v1, p0, Ll/b0;->b:I

    iget-object v2, p0, Ll/b0;->d:Ljava/lang/Object;

    check-cast v2, Lk6/d4;

    iget-object v3, p0, Ll/b0;->e:Ljava/lang/Object;

    check-cast v3, Landroid/content/Intent;

    iget-object v4, v0, Lj/a;->a:Landroid/content/Context;

    check-cast v4, Lk6/e7;

    invoke-interface {v4, v1}, Lk6/e7;->zza(I)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v2, v2, Lk6/d4;->n:Lk6/f4;

    const-string v4, "Local AppMeasurementService processed last upload request. StartId"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v4, v1}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lj/a;->f()Lk6/d4;

    move-result-object v1

    const-string v2, "Completed wakeful intent."

    iget-object v1, v1, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v1, v2}, Lk6/f4;->b(Ljava/lang/String;)V

    iget-object v0, v0, Lj/a;->a:Landroid/content/Context;

    check-cast v0, Lk6/e7;

    invoke-interface {v0, v3}, Lk6/e7;->a(Landroid/content/Intent;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Ll/b0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/b0;->d:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Typeface;

    iget v2, p0, Ll/b0;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
