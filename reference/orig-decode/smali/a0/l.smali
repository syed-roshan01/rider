.class public final La0/l;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/e;


# instance fields
.field public final synthetic a:La0/m;

.field public final synthetic b:Ld9/u;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(La0/m;Ld9/u;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/l;->a:La0/m;

    iput-object p2, p0, La0/l;->b:Ld9/u;

    iput p3, p0, La0/l;->c:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-object v0, p0, La0/l;->b:Ld9/u;

    iget-object v0, v0, Ld9/u;->a:Ljava/lang/Object;

    check-cast v0, La0/i;

    iget-object v1, p0, La0/l;->a:La0/m;

    iget v2, p0, La0/l;->c:I

    invoke-virtual {v1, v0, v2}, La0/m;->l(La0/i;I)Z

    move-result v0

    return v0
.end method
