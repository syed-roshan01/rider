.class public final Lr6/m;
.super Lr6/a;


# instance fields
.field public final c:Lr6/p;


# direct methods
.method public constructor <init>(Lr6/p;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lr6/a;-><init>(II)V

    iput-object p1, p0, Lr6/m;->c:Lr6/p;

    return-void
.end method


# virtual methods
.method public final b(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr6/m;->c:Lr6/p;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
