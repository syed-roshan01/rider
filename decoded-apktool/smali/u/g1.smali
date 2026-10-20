.class public final Lu/g1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lh1/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ly0/o;

.field public final synthetic d:Ly0/d;

.field public final synthetic e:Lr1/l;

.field public final synthetic f:F

.field public final synthetic n:Le1/l;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public constructor <init>(Lh1/c;Ljava/lang/String;Ly0/o;Ly0/d;Lr1/l;FLe1/l;II)V
    .locals 0

    iput-object p1, p0, Lu/g1;->a:Lh1/c;

    iput-object p2, p0, Lu/g1;->b:Ljava/lang/String;

    iput-object p3, p0, Lu/g1;->c:Ly0/o;

    iput-object p4, p0, Lu/g1;->d:Ly0/d;

    iput-object p5, p0, Lu/g1;->e:Lr1/l;

    iput p6, p0, Lu/g1;->f:F

    iput-object p7, p0, Lu/g1;->n:Le1/l;

    iput p8, p0, Lu/g1;->o:I

    iput p9, p0, Lu/g1;->p:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object v0, p0, Lu/g1;->a:Lh1/c;

    iget-object v1, p0, Lu/g1;->b:Ljava/lang/String;

    iget-object v2, p0, Lu/g1;->c:Ly0/o;

    iget-object v3, p0, Lu/g1;->d:Ly0/d;

    iget-object v4, p0, Lu/g1;->e:Lr1/l;

    iget v5, p0, Lu/g1;->f:F

    iget-object v6, p0, Lu/g1;->n:Le1/l;

    iget p1, p0, Lu/g1;->o:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lm0/s;->m(I)I

    move-result v8

    iget v9, p0, Lu/g1;->p:I

    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/a;->c(Lh1/c;Ljava/lang/String;Ly0/o;Ly0/d;Lr1/l;FLe1/l;Lm0/m;II)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
